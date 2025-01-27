package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_B[T_B[Boolean]]) extends T_A[T_B[T_A[Byte, Int]], T_A[T_B[Char], T_B[Char]]]
case class CC_B() extends T_A[T_B[T_A[Byte, Int]], T_A[T_B[Char], T_B[Char]]]
case class CC_C() extends T_A[T_B[T_A[Byte, Int]], T_A[T_B[Char], T_B[Char]]]
case class CC_D(a: (T_B[CC_A],T_B[Boolean]), b: CC_B) extends T_B[Boolean]
case class CC_E() extends T_B[Boolean]
case class CC_F(a: T_B[Boolean], b: Char, c: CC_D) extends T_B[Boolean]

val v_a: T_A[T_B[T_A[Byte, Int]], T_A[T_B[Char], T_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B()