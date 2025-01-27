package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_B[(Int,Byte), Char], T_A[Boolean]]) extends T_A[T_A[T_B[Boolean, Char]]]
case class CC_B(a: CC_A) extends T_A[T_A[T_B[Boolean, Char]]]
case class CC_C(a: CC_A, b: CC_A, c: T_A[T_A[CC_B]]) extends T_A[T_A[T_B[Boolean, Char]]]

val v_a: T_A[T_A[T_B[Boolean, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(_, CC_A(_), _) => 1 
}
}
// This is not matched: CC_B(CC_A(_))