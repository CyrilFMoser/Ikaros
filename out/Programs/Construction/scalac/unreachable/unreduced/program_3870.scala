package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Int) extends T_A[C, (Boolean,T_A[Byte, Char])]
case class CC_B[D](a: T_A[D, D], b: CC_A[D], c: CC_A[D]) extends T_A[D, (Boolean,T_A[Byte, Char])]

val v_a: T_A[Byte, (Boolean,T_A[Byte, Char])] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(_), CC_A(_)) => 1 
}
}