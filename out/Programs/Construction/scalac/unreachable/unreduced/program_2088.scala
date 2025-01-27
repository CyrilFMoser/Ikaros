package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_B[T_B[Char]]]
case class CC_B(a: T_A[Byte], b: (Int,T_B[CC_A]), c: CC_A) extends T_A[T_B[T_B[Char]]]
case class CC_C(a: CC_B, b: T_A[Char], c: CC_B) extends T_A[CC_B]
case class CC_D[C](a: (Byte,(CC_A,CC_A))) extends T_B[C]

val v_a: T_A[T_B[T_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, (_,CC_D(_)), CC_A()) => 1 
}
}