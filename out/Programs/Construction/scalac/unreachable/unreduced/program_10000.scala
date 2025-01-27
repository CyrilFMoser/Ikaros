package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: Char, c: T_B) extends T_A[T_B]
case class CC_B() extends T_A[T_B]
case class CC_C(a: T_A[CC_A], b: CC_A) extends T_A[T_B]
case class CC_D() extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_D()) => 0 
  case CC_B() => 1 
  case CC_C(_, CC_A(CC_D(), 'x', CC_D())) => 2 
  case CC_C(_, CC_A(CC_D(), _, CC_D())) => 3 
}
}