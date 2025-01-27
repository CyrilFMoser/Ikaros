package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: (Int,Char)) extends T_A[T_A[T_B]]
case class CC_B() extends T_A[T_A[T_B]]
case class CC_C[B](a: B) extends T_B
case class CC_D(a: (Boolean,CC_A)) extends T_B
case class CC_E(a: T_B, b: T_A[T_B], c: CC_C[CC_C[T_B]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D((_,CC_A(_))) => 1 
  case CC_E(CC_C(_), _, _) => 2 
  case CC_E(CC_D((_,_)), _, _) => 3 
  case CC_E(CC_E(_, _, _), _, _) => 4 
}
}