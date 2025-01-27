package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C]) extends T_A[C]
case class CC_B(a: CC_A[CC_A[Byte]], b: T_A[Byte]) extends T_B[T_A[T_B[Char]]]
case class CC_C(a: T_B[T_B[CC_B]], b: CC_B, c: (T_A[CC_B],CC_B)) extends T_B[T_A[T_B[Char]]]
case class CC_D(a: T_A[Char], b: T_B[Int], c: CC_B) extends T_B[T_A[T_B[Char]]]

val v_a: T_B[T_A[T_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(CC_A(_))) => 0 
  case CC_C(_, _, _) => 1 
  case CC_D(_, _, CC_B(CC_A(_), CC_A(_))) => 2 
}
}