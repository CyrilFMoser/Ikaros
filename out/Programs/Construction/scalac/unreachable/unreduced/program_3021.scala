package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Int, b: T_A[Byte]) extends T_A[Byte]
case class CC_B(a: Int, b: CC_A) extends T_A[Byte]
case class CC_C(a: CC_A, b: T_B[T_B[CC_B, (Boolean,Char)], CC_A], c: T_A[CC_A]) extends T_A[Byte]
case class CC_D[E, D, F]() extends T_B[E, D]
case class CC_E[G, H](a: (T_B[CC_C, CC_C],T_A[Byte])) extends T_B[G, H]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _))) => 0 
  case CC_A(_, CC_A(_, CC_B(_, _))) => 1 
  case CC_A(_, CC_A(_, CC_C(_, _, _))) => 2 
  case CC_A(_, CC_B(_, CC_A(_, _))) => 3 
  case CC_A(_, CC_C(CC_A(_, _), _, _)) => 4 
  case CC_B(_, CC_A(12, CC_A(_, _))) => 5 
  case CC_B(_, CC_A(12, CC_B(_, _))) => 6 
  case CC_B(_, CC_A(12, CC_C(_, _, _))) => 7 
  case CC_B(_, CC_A(_, CC_B(_, _))) => 8 
  case CC_B(_, CC_A(_, CC_C(_, _, _))) => 9 
  case CC_C(_, _, _) => 10 
}
}
// This is not matched: CC_B(_, CC_A(_, CC_A(_, _)))