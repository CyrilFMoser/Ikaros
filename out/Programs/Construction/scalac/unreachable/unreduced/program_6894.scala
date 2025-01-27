package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[Char, Boolean], (T_A,(Char,Char))], b: T_A, c: T_A) extends T_A
case class CC_B[C](a: C, b: C, c: T_B[C, T_B[Boolean, C]]) extends T_B[CC_A, C]
case class CC_C[D](a: T_B[CC_A, D], b: T_B[D, D]) extends T_B[CC_A, D]
case class CC_D[E]() extends T_B[CC_A, E]

val v_a: T_B[CC_A, Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(CC_B(_, _, _), _) => 1 
  case CC_C(CC_C(CC_B(_, _, _), _), _) => 2 
  case CC_C(CC_C(CC_C(_, _), _), _) => 3 
  case CC_C(CC_C(CC_D(), _), _) => 4 
  case CC_C(CC_D(), _) => 5 
  case CC_D() => 6 
}
}