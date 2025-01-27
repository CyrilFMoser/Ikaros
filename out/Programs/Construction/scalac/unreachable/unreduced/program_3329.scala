package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[Char]
case class CC_B(a: CC_A, b: T_A[T_A[(Int,Char)]]) extends T_A[T_A[T_A[CC_A]]]
case class CC_C() extends T_B
case class CC_D(a: T_A[Char], b: (CC_A,CC_B), c: T_B) extends T_B
case class CC_E(a: CC_B, b: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_A(), _, CC_C()) => 1 
  case CC_D(CC_A(), _, CC_D(_, _, _)) => 2 
  case CC_D(CC_A(), _, CC_E(CC_B(_, _), _)) => 3 
  case CC_E(CC_B(CC_A(), _), CC_C()) => 4 
  case CC_E(CC_B(CC_A(), _), CC_D(CC_A(), (_,_), _)) => 5 
  case CC_E(CC_B(CC_A(), _), CC_E(CC_B(_, _), CC_C())) => 6 
  case CC_E(CC_B(CC_A(), _), CC_E(CC_B(_, _), CC_D(_, _, _))) => 7 
}
}
// This is not matched: CC_E(CC_B(CC_A(), _), CC_E(CC_B(_, _), CC_E(_, _)))