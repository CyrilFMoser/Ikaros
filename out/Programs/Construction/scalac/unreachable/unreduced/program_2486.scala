package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: T_A[T_A[D, D], D]) extends T_A[T_A[T_B[Char], Char], D]
case class CC_B[E](a: CC_A[E]) extends T_B[E]
case class CC_C(a: Boolean, b: Char, c: Boolean) extends T_B[CC_B[(Int,Char)]]
case class CC_D(a: T_B[CC_C], b: (Boolean,Char), c: (CC_C,CC_A[CC_C])) extends T_B[CC_B[(Int,Char)]]

val v_a: T_B[CC_B[(Int,Char)]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(CC_B(_), _)) => 0 
  case CC_B(CC_A(CC_C(_, _, _), _)) => 1 
  case CC_B(CC_A(CC_D(_, _, _), _)) => 2 
  case CC_C(_, _, _) => 3 
  case CC_D(_, _, _) => 4 
}
}