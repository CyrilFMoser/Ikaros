package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_A[Boolean], T_A[Boolean]], b: T_B[T_A[Byte], T_B[Char, Byte]]) extends T_A[T_B[T_B[Int, Int], T_B[Int, Char]]]
case class CC_B(a: T_A[CC_A], b: T_B[Byte, (CC_A,(Boolean,Boolean))]) extends T_A[T_B[T_B[Int, Int], T_B[Int, Char]]]
case class CC_C[D, E](a: T_A[E]) extends T_B[E, D]
case class CC_D[G, F](a: (T_B[CC_A, CC_A],CC_A)) extends T_B[G, F]
case class CC_E[H](a: H, b: T_A[H], c: T_A[H]) extends T_B[T_B[H, H], H]

val v_a: T_A[T_B[T_B[Int, Int], T_B[Int, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_), CC_C(_)) => 0 
  case CC_A(CC_D((_,_)), CC_C(_)) => 1 
  case CC_A(CC_C(_), CC_D(_)) => 2 
  case CC_A(CC_D((_,_)), CC_D(_)) => 3 
  case CC_B(_, CC_C(_)) => 4 
  case CC_B(_, CC_D(_)) => 5 
}
}