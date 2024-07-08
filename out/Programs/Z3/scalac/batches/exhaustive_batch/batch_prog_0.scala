package Program_0 

 object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: T_A[B]) extends T_A[B]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), CC_A(CC_A(_, _), CC_A(_, _))) => 0 
  case CC_A(CC_A(_, CC_A(_, _)), CC_A(_, _)) => 1 
  case CC_A(CC_A(CC_A(_, _), CC_A(_, _)), CC_A(CC_A(_, _), CC_A(_, _))) => 2 
  case CC_A(CC_A(CC_A(_, _), _), CC_A(_, CC_A(_, _))) => 3 
}
}