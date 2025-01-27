package Program_9 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: T_A[B], b: T_A[C], c: (T_A[Boolean],T_A[Byte])) extends T_A[B]

val v_a: CC_A[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
}
}