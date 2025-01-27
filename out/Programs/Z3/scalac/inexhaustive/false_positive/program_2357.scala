package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_B[F](a: T_A[F, F], b: (Boolean,Char)) extends T_A[(Byte,Char), F]

val v_a: T_A[(Byte,Char), Char] = null
val v_b: Int = v_a match{
  case CC_B(_, (_,'x')) => 0 
}
}
// This is not matched: (CC_A Boolean
//      Byte
//      (CC_B Byte Byte (CC_B Byte Byte Wildcard (T_A Byte Byte)) (T_A Byte Byte))
//      (T_A Byte Boolean))