package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: Int) extends T_A[D, T_B[D]]
case class CC_B(a: Boolean, b: T_B[(Char,Boolean)]) extends T_B[(Char,Boolean)]
case class CC_C(a: T_B[(Char,Boolean)], b: T_B[T_B[(Byte,Byte)]], c: CC_B) extends T_B[(Char,Boolean)]

val v_a: T_A[T_B[(Char,Boolean)], T_B[T_B[(Char,Boolean)]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_, CC_B(_, _)), _) => 0 
  case CC_A(CC_B(_, CC_C(_, _, _)), _) => 1 
  case CC_A(CC_C(_, _, _), _) => 2 
}
}