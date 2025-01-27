package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: Byte) extends T_A[C]
case class CC_B[D](a: T_B[D], b: (T_A[Char],(Char,Byte))) extends T_A[D]
case class CC_C(a: CC_A[CC_A[Int]]) extends T_A[T_A[T_B[Int]]]
case class CC_D(a: CC_B[(CC_C,CC_C)]) extends T_B[(CC_A[CC_C],T_B[Boolean])]
case class CC_E(a: Char) extends T_B[(CC_A[CC_C],T_B[Boolean])]
case class CC_F(a: CC_A[T_A[CC_C]]) extends T_B[(CC_A[CC_C],T_B[Boolean])]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, (_,_)) => 1 
}
}