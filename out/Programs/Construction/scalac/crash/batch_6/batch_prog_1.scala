package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: Byte, b: (T_A[Char, Int],T_A[Byte, Int])) extends T_A[C, D]

val v_a: CC_A[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, (CC_A(_, _),CC_A(_, _))) => 0 
}
}