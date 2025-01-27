package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_B[Int, Char]]) extends T_A[T_B[T_B[Int, Char], (Char,Int)]]
case class CC_B[D, E]() extends T_B[E, D]
case class CC_C[G, F](a: CC_A, b: CC_B[G, G], c: (T_B[CC_A, CC_A],CC_B[(Boolean,Int), CC_A])) extends T_B[F, G]

val v_a: T_B[CC_A, Char] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_A(_), CC_B(), (CC_B(),CC_B())) => 1 
  case CC_C(CC_A(_), CC_B(), (CC_C(_, _, _),CC_B())) => 2 
}
}