package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[Boolean, C], b: T_A[Boolean, C]) extends T_A[Boolean, C]
case class CC_B[D](a: CC_A[D], b: T_A[D, D]) extends T_A[Boolean, D]
case class CC_C(a: Boolean, b: (Char,T_A[Byte, Char])) extends T_A[T_A[CC_B[(Boolean,Int)], Boolean], T_A[Boolean, Int]]

val v_a: T_A[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(_, CC_B(_, _)) => 1 
  case CC_B(CC_A(_, _), _) => 2 
}
}