package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: (T_B,T_B)) extends T_A[C, (T_A[T_B, T_B],T_A[T_B, (Boolean,Boolean)])]
case class CC_B[D]() extends T_A[T_B, D]
case class CC_C() extends T_B
case class CC_D(a: Byte, b: CC_A[CC_A[Int]], c: T_A[Byte, T_A[CC_C, CC_C]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, CC_A(_, (_,_)), _) => 1 
}
}