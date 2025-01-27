package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: T_A[D]) extends T_A[D]
case class CC_B[E](a: T_B[E, E], b: E, c: T_A[T_B[(Int,Boolean), (Int,Boolean)]]) extends T_A[E]
case class CC_C(a: (Byte,CC_B[Int]), b: Int, c: CC_A[T_A[Int]]) extends T_A[CC_B[(Byte,(Byte,Boolean))]]
case class CC_D[G]() extends T_B[Int, G]

val v_a: T_A[CC_B[(Byte,(Byte,Boolean))]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_B(_, CC_B(_, _, _), CC_A(_, _)), _) => 1 
  case CC_A(CC_B(_, CC_B(_, _, _), CC_B(_, _, _)), _) => 2 
  case CC_A(CC_C(_, _, CC_A(_, _)), _) => 3 
  case CC_B(_, _, _) => 4 
  case CC_C((_,CC_B(_, _, _)), _, CC_A(_, _)) => 5 
}
}