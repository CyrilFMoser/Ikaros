package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_B[T_B[Boolean, Byte], T_B[(Char,Boolean), Char]], b: T_B[Int, (Boolean,Byte)]) extends T_A[T_B[T_A[Byte, Char], T_B[Byte, Char]], T_B[T_B[(Boolean,Boolean), Boolean], T_B[Char, Boolean]]]
case class CC_B(a: CC_A) extends T_A[T_B[T_A[Byte, Char], T_B[Byte, Char]], T_B[T_B[(Boolean,Boolean), Boolean], T_B[Char, Boolean]]]
case class CC_C(a: T_A[Int, T_B[CC_B, CC_A]]) extends T_A[T_B[T_A[Byte, Char], T_B[Byte, Char]], T_B[T_B[(Boolean,Boolean), Boolean], T_B[Char, Boolean]]]

val v_a: T_A[T_B[T_A[Byte, Char], T_B[Byte, Char]], T_B[T_B[(Boolean,Boolean), Boolean], T_B[Char, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, _)) => 1 
  case CC_C(_) => 2 
}
}