package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A() extends T_A[T_B[T_B[(Boolean,Boolean), Char], T_A[Char, Byte]], T_B[T_B[Byte, Int], T_A[Byte, Char]]]
case class CC_B(a: T_B[T_A[CC_A, CC_A], CC_A], b: T_B[CC_A, CC_A], c: T_B[CC_A, T_B[CC_A, (Int,Char)]]) extends T_A[T_B[T_B[(Boolean,Boolean), Char], T_A[Char, Byte]], T_B[T_B[Byte, Int], T_A[Byte, Char]]]
case class CC_C(a: T_A[Byte, CC_B], b: CC_B) extends T_A[T_B[T_B[(Boolean,Boolean), Char], T_A[Char, Byte]], T_B[T_B[Byte, Int], T_A[Byte, Char]]]
case class CC_D[E, F](a: CC_C) extends T_B[E, F]
case class CC_E() extends T_B[CC_A, Char]
case class CC_F(a: CC_E, b: (CC_C,T_B[CC_B, CC_A])) extends T_B[CC_A, Char]

val v_a: T_A[T_B[T_B[(Boolean,Boolean), Char], T_A[Char, Byte]], T_B[T_B[Byte, Int], T_A[Byte, Char]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_D(CC_C(_, _)), CC_D(_), CC_D(_)) => 1 
  case CC_C(_, CC_B(_, _, _)) => 2 
}
}