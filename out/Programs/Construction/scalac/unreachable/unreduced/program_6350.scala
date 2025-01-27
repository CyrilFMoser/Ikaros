package Program_3 

object Test {
sealed trait T_A[A]
case class CC_A(a: Byte) extends T_A[Char]
case class CC_B[B](a: CC_A, b: (T_A[Boolean],CC_A)) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, (_,CC_A(_))) => 1 
}
}