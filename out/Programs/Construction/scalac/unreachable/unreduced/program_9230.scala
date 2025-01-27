package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_A[E, E], b: Boolean, c: T_A[E, E]) extends T_A[E, F]
case class CC_B[H, G](a: H, b: Byte, c: H) extends T_A[G, H]
case class CC_C[J, I](a: T_A[J, J]) extends T_A[J, I]
case class CC_D(a: Byte, b: (Char,Boolean), c: CC_A[CC_B[Char, Int], T_A[Char, Int]]) extends T_B[CC_A[T_A[Int, Int], Int], CC_C[Byte, CC_A[Char, Byte]]]
case class CC_E(a: T_B[T_A[(Char,Byte), CC_D], (CC_D,(Boolean,Byte))], b: T_A[T_A[CC_D, CC_D], T_A[CC_D, CC_D]]) extends T_B[CC_A[T_A[Int, Int], Int], CC_C[Byte, CC_A[Char, Byte]]]

val v_a: T_A[T_B[CC_A[T_A[Int, Int], Int], CC_C[Byte, CC_A[Char, Byte]]], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(CC_A(CC_A(_, _, _), _, CC_A(_, _, _))) => 2 
  case CC_C(CC_A(CC_A(_, _, _), _, CC_B(_, _, _))) => 3 
  case CC_C(CC_A(CC_A(_, _, _), _, CC_C(_))) => 4 
  case CC_C(CC_A(CC_B(_, _, _), _, CC_A(_, _, _))) => 5 
  case CC_C(CC_A(CC_B(_, _, _), _, CC_B(_, _, _))) => 6 
  case CC_C(CC_A(CC_B(_, _, _), _, CC_C(_))) => 7 
  case CC_C(CC_A(CC_C(_), _, CC_A(_, _, _))) => 8 
  case CC_C(CC_A(CC_C(_), _, CC_B(_, _, _))) => 9 
  case CC_C(CC_B(CC_D(_, _, _), _, CC_D(_, _, _))) => 10 
  case CC_C(CC_B(CC_E(_, _), _, CC_D(_, _, _))) => 11 
  case CC_C(CC_B(CC_D(_, _, _), _, CC_E(_, _))) => 12 
  case CC_C(CC_B(CC_E(_, _), _, CC_E(_, _))) => 13 
  case CC_C(CC_C(_)) => 14 
}
}
// This is not matched: CC_C(CC_A(CC_C(_), _, CC_C(_)))