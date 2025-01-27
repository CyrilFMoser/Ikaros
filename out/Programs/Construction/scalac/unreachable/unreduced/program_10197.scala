package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_A[T_A[Char]]]
case class CC_B() extends T_A[T_A[T_A[Char]]]
case class CC_C() extends T_A[T_A[T_A[Char]]]
case class CC_D(a: CC_C) extends T_B[CC_B]
case class CC_E(a: T_A[CC_A]) extends T_B[CC_B]
case class CC_F(a: CC_A, b: T_B[CC_B], c: CC_B) extends T_B[CC_B]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_D(CC_C()) => 0 
  case CC_E(_) => 1 
  case CC_F(CC_A(), CC_D(CC_C()), _) => 2 
  case CC_F(CC_A(), CC_E(_), _) => 3 
  case CC_F(CC_A(), CC_F(CC_A(), CC_D(_), _), _) => 4 
  case CC_F(CC_A(), CC_F(CC_A(), CC_E(_), _), _) => 5 
  case CC_F(CC_A(), CC_F(CC_A(), CC_F(_, _, _), _), _) => 6 
}
}