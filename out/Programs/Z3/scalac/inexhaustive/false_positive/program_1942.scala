package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: ((Byte,Char),Char)) extends T_A[T_A[(Boolean,Boolean), (Int,Char)], C]

val v_a: T_A[T_A[(Boolean,Boolean), (Int,Char)], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,'x')) => 0 
}
}
// This is not matched: (CC_C (CC_C (CC_C (CC_B Byte (CC_A (CC_B Wildcard Wildcard T_A) T_A) T_A) T_A)
//            T_A)
//      T_A)