package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[C], b: Char, c: Char) extends T_A[C]
case class CC_B() extends T_B[(T_A[Byte],T_B[Char])]
case class CC_C(a: T_B[T_A[CC_B]], b: (T_B[CC_B],CC_B), c: CC_A[(Byte,CC_B)]) extends T_B[(T_A[Byte],T_B[Char])]

val v_a: T_B[(T_A[Byte],T_B[Char])] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, (_,_), _) => 1 
}
}