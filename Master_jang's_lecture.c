

// 코딩스타일 // https://namu.wiki/w/%EC%BD%94%EB%94%A9%20%EC%8A%A4%ED%83%80%EC%9D%BC#s-3.5
// 헝가리안 표기법 // https://namu.wiki/w/%ED%97%9D%EA%B0%80%EB%A6%AC%EC%95%88%20%ED%91%9C%EA%B8%B0%EB%B2%95
// 스파게티 코드 // https://namu.wiki/w/%EC%8A%A4%ED%8C%8C%EA%B2%8C%ED%8B%B0%20%EC%BD%94%EB%93%9C
// 리팩토링... 사용자는 변경 사항을 모르지만...내부적으로 변화됨.

#include <stdio.h>
#include <stdlib.h>
#include <windows.h>

tag_SoundSendBuf				g_SoundDataSendBuf; //클래스 밖의 함수는 global이라는 의미로 접두어(g_)를 붙인다.
extern DAC_HandleTypeDef 		g_hdac;



class GLOBAL {
    static int a = 0;
};

GLOBAL g;

unsigned char m_ucSound_OnF = 0;

void Sound_Send_Data_Set( const unsigned int p_port,const unsigned int p_set,unsigned int p_port, unsigned int p_set,unsigned int p_port, unsigned int p_set,unsigned int p_port, unsigned int p_set)
{//const는 코딩의 실수를 줄여준다. 어떻게? 파라미터 같은 입력값중에 상수값을 콕 집어서 혹시라도 코드에 문제가 생기는 것을 방지.

    GLOBAL::a = 123;

    g.asdf = 100;       //위에 class GLOBAL 선언해서 쓸 때마다 GLOBAL::a =123;을 치지 않고 g.a=123;으로 단축시킬 수 있도록
    g.a = 123;

    tag_SoundSendBuf *Com_Target;
	
	if( p_port >= UART_CHANNEL_MAX ) return;
	Com_Target = &SoundDataSendBuf;
	
	Com_Target->Buf[Com_Target->In] = (enum _tag_SOUND_LIST)p_set;
	Com_Target->In++;
	if( (Com_Target->In) >= SOUND_SEND_BUF_CHECK )
	{
		Com_Target->In = 0;
	}

    //이건 코딩 스타일이고 회사마다 다르지만 잘 정리해두면 가독성이 매우 올라간다.
    p_....parameter // 이건 확인 안해도 입력값이구나 알 수 있음.
    c_....column    
    t_...temparary  // 함수 안에서 선언된 임시적인 휘발성 변수.
    m_...member
    r_...recieve
    o_.....object.
    a_....array.

    //처음 배울 때 이렇게 for문을 작성하는데 c#?은 더 편하게 작성할 수 있다.
    for ( int a = 0 ; a < 10 ; a ++ ) { }
    for ( int a = 0 ; a < 10 ; a ++ ) { }

    // 이건 뭔지 모르겠음.
    std::vector < int > vvvvvv { 1,2,3,4,5,7,8,0 };
    std::map < int , std::string > vvvvvv { 1,2,3,4,5,7,8,0 };
    std::list < int > vvvvvv { 1,2,3,4,5,7,8,0 };
    for ( auto v : vvvvvv ) { }

    int c_AAAAAAAAAAAAAA // column.
    int r_AAAAAAAAAAAA // receive.
    int r_AAAAAA; read (r_AAAAAA);

    std:;string t_AAAAAAAAAAAA;

    t_AAAAAAAAAAAA.size();

    

{ // json에서 사용하는 것들
    "ASDF":"ASDf",
    "asdf":123,
    "asdf":123.0123,
    "ASDF":{"ASDF":123}
    "ASDF":["ASDF",123]
}

// 포인터로 함수를 불러올 수 있다.
    void a1() { ... }
    void a2() { ... }
    void a3() { ... }
    void a4() { ... }
    void a5() { ... }
    void a6() { ... }

    함수포인터 a [ ] = {
        a1,
        a2,
        a3,
        a4,
        a5,
        a6,
    };

    a [ 5 ] ();

    람다포인터 a [ ] = {
        [] -> () void { code... },
        [] -> () void { code... },
        [] -> () void { code... },
        [] -> () void { code... },
        [] -> () void { code... },
        [] -> () void { code... },
    };

    a [ 5 ] ();
}

enum _tag_SOUND_LIST *Sound_Send_Data_Get( unsigned int port )
{   
   enum _tag_SOUND_LIST *pRtnDat;
   tag_SoundSendBuf *pCom_Target;
   
   pCom_Target = &SoundDataSendBuf;
   
   if( pCom_Target->Out==pCom_Target->In )      return NULL;
   pRtnDat = &pCom_Target->Buf[pCom_Target->Out];
   pCom_Target->Out++;
   if( pCom_Target->Out >= SOUND_SEND_BUF_CHECK ) pCom_Target->Out = 0;
   
   return pRtnDat;
}

void Sound_Set_Init( int channel )
{
	Sound_Send_Data_Set(0, channel);
	return;
}

void HAL_DAC_ConvCpltCallbackCh1(DAC_HandleTypeDef *hdac)
{
	HAL_DAC_Stop_DMA(hdac, DAC_CHANNEL_1);
	HAL_GPIO_WritePin(SPK_SHDN_GPIO_Port, SPK_SHDN_Pin, GPIO_PIN_RESET);
}

void Sound_Send_Schedule( void )
{
	static unsigned int count = 0;
	static unsigned int count_check = 0;
	enum _tag_SOUND_LIST *pdata;
	unsigned int channel;
	
	if( m_ucSound_OnF )
	{
		if( ++count_check >= 2000 )
		{
			count_check = 0;
			m_ucSound_OnF = 0;
		}
	}
	else count_check = 0;
	
	if( 100 > ++count ) return;
	
	count = 0;
	if( m_ucSound_OnF ) return;
	pdata = Sound_Send_Data_Get(0);
	
	if( NULL ==  pdata ) return;
	channel = *pdata;
	if( channel >= SOUND_MAX ) return;
	
	HAL_GPIO_WritePin(SPK_SHDN_GPIO_Port, SPK_SHDN_Pin, GPIO_PIN_SET);
	
	switch (channel)
	{
		case SOUND_CONNECTION 			: 	HAL_DAC_Start_DMA( &hdac, DAC_CHANNEL_1, (uint32_t*)vehicle_connections,	sizeof(vehicle_connections)		/sizeof(vehicle_connections[0]),	DAC_ALIGN_8B_R);	break;
		case SOUND_CHARGING 			: 	HAL_DAC_Start_DMA( &hdac, DAC_CHANNEL_1, (uint32_t*)start_charging,			sizeof(start_charging)			/sizeof(start_charging[0]),			DAC_ALIGN_8B_R);	break;
		case SOUND_CHARGING_COMPLETE	:	HAL_DAC_Start_DMA( &hdac, DAC_CHANNEL_1, (uint32_t*)charging_complete,		sizeof(charging_complete)		/sizeof(charging_complete[0]),		DAC_ALIGN_8B_R);	break;
		case SOUND_CHARGING_END			:	HAL_DAC_Start_DMA( &hdac, DAC_CHANNEL_1, (uint32_t*)end_charging,			sizeof(end_charging)			/sizeof(end_charging[0]),			DAC_ALIGN_8B_R);	break;
		case SOUND_APPROVED_BEEN		:	HAL_DAC_Start_DMA( &hdac, DAC_CHANNEL_1, (uint32_t*)wave_been_approved,		sizeof(wave_been_approved)		/sizeof(wave_been_approved[0]),		DAC_ALIGN_8B_R);	break;
		case SOUND_APPROVED_FAIL		:	HAL_DAC_Start_DMA( &hdac, DAC_CHANNEL_1, (uint32_t*)wave_failed_approve,	sizeof(wave_failed_approve)		/sizeof(wave_failed_approve[0]),	DAC_ALIGN_8B_R);	break;
		case SOUND_DRIVE_SAFELY			:	HAL_DAC_Start_DMA( &hdac, DAC_CHANNEL_1, (uint32_t*)wave_drive_safely,		sizeof(wave_drive_safely)		/sizeof(wave_drive_safely[0]),		DAC_ALIGN_8B_R);	break;
		case SOUND_USED					:	HAL_DAC_Start_DMA( &hdac, DAC_CHANNEL_1, (uint32_t*)wave_used,				sizeof(wave_used)				/sizeof(wave_used[0]),				DAC_ALIGN_8B_R);	break;
		case SOUND_CONNECT_CONNECTOR	:	HAL_DAC_Start_DMA( &hdac, DAC_CHANNEL_1, (uint32_t*)wave_connect_connector,	sizeof(wave_connect_connector)	/sizeof(wave_connect_connector[0]),	DAC_ALIGN_8B_R);	break;
		case SOUND_APPROVED_REQUEST		:	HAL_DAC_Start_DMA( &hdac, DAC_CHANNEL_1, (uint32_t*)wave_req_approved,		sizeof(wave_req_approved)		/sizeof(wave_req_approved[0]),		DAC_ALIGN_8B_R);	break;
		case SOUND_CHECK_POWER_CABLE	:	HAL_DAC_Start_DMA( &hdac, DAC_CHANNEL_1, (uint32_t*)Check_the_power_cable,	sizeof(Check_the_power_cable)	/sizeof(Check_the_power_cable[0]),	DAC_ALIGN_8B_R);	break;
		case SOUND_RCD_PROTECTION		:	HAL_DAC_Start_DMA( &hdac, DAC_CHANNEL_1, (uint32_t*)Short_circuit_protection_mode_activated,	sizeof(Short_circuit_protection_mode_activated)	/sizeof(Short_circuit_protection_mode_activated[0]),	DAC_ALIGN_8B_R);	break;
	}
	m_ucSound_OnF = 1;
}
