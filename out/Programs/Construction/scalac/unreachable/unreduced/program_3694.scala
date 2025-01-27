package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_A[Char]]) extends T_A[T_B[Int, (Char,(Boolean,Char))]]
case class CC_B[D, E]() extends T_B[E, D]
case class CC_C[G, F](a: T_A[G], b: CC_B[G, T_B[G, CC_A]], c: (T_B[CC_A, CC_A],T_B[CC_A, (Boolean,Byte)])) extends T_B[F, G]
case class CC_D[H, I, J]() extends T_B[H, I]

val v_a: T_B[Byte, CC_A] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, CC_B(), (CC_B(),CC_B())) => 1 
  case CC_C(_, CC_B(), (CC_B(),CC_C(_, _, _))) => 2 
  case CC_C(_, CC_B(), (CC_B(),CC_D())) => 3 
  case CC_C(_, CC_B(), (CC_C(_, _, _),CC_B())) => 4 
  case CC_C(_, CC_B(), (CC_C(_, _, _),CC_C(_, _, _))) => 5 
  case CC_C(_, CC_B(), (CC_C(_, _, _),CC_D())) => 6 
  case CC_C(_, CC_B(), (CC_D(),CC_B())) => 7 
  case CC_C(_, CC_B(), (CC_D(),CC_D())) => 8 
  case CC_D() => 9 
}
}
// This is not matched: CC_C(_, CC_B(), (CC_D(),CC_C(_, _, _)))