package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Char, b: T_B[T_A, (Char,T_A)]) extends T_A
case class CC_B[C]() extends T_B[C, (T_B[T_A, Byte],T_B[T_A, (Char,Boolean)])]
case class CC_C[D](a: Char, b: Byte, c: T_B[D, D]) extends T_B[D, (T_B[T_A, Byte],T_B[T_A, (Char,Boolean)])]

val v_a: T_B[T_A, (T_B[T_A, Byte],T_B[T_A, (Char,Boolean)])] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _, _) => 1 
}
}