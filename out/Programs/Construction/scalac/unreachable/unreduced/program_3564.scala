package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_B[E, T_A[Char, E]], b: Int) extends T_A[E, F]
case class CC_B[H, G](a: Byte, b: CC_A[G, G], c: T_A[H, G]) extends T_A[G, H]
case class CC_C[J, I](a: T_A[I, J], b: ((Boolean,Int),(Char,Boolean))) extends T_A[I, J]
case class CC_D[K](a: Int, b: CC_C[K, K], c: T_A[T_B[K, K], K]) extends T_B[K, CC_C[((Char,Boolean),Byte), CC_A[Char, (Int,Char)]]]
case class CC_E[L](a: L, b: T_A[L, L]) extends T_B[L, CC_C[((Char,Boolean),Byte), CC_A[Char, (Int,Char)]]]

val v_a: T_A[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(0, CC_A(_, _), CC_A(_, _)) => 1 
  case CC_B(_, CC_A(_, _), CC_A(_, _)) => 2 
  case CC_B(0, CC_A(_, _), CC_B(0, CC_A(_, _), CC_A(_, _))) => 3 
  case CC_B(_, CC_A(_, _), CC_B(0, CC_A(_, _), CC_A(_, _))) => 4 
  case CC_B(0, CC_A(_, _), CC_B(0, CC_A(_, _), CC_B(_, _, _))) => 5 
  case CC_B(_, CC_A(_, _), CC_B(0, CC_A(_, _), CC_B(_, _, _))) => 6 
  case CC_B(0, CC_A(_, _), CC_B(0, CC_A(_, _), CC_C(_, _))) => 7 
  case CC_B(_, CC_A(_, _), CC_B(0, CC_A(_, _), CC_C(_, _))) => 8 
  case CC_B(0, CC_A(_, _), CC_B(_, CC_A(_, _), CC_A(_, _))) => 9 
  case CC_B(0, CC_A(_, _), CC_B(_, CC_A(_, _), CC_B(_, _, _))) => 10 
  case CC_B(_, CC_A(_, _), CC_B(_, CC_A(_, _), CC_B(_, _, _))) => 11 
  case CC_B(0, CC_A(_, _), CC_B(_, CC_A(_, _), CC_C(_, _))) => 12 
  case CC_B(_, CC_A(_, _), CC_B(_, CC_A(_, _), CC_C(_, _))) => 13 
  case CC_B(0, CC_A(_, _), CC_C(_, (_,_))) => 14 
  case CC_B(_, CC_A(_, _), CC_C(_, (_,_))) => 15 
  case CC_C(_, _) => 16 
}
}
// This is not matched: CC_B(_, CC_A(_, _), CC_B(_, CC_A(_, _), CC_A(_, _)))