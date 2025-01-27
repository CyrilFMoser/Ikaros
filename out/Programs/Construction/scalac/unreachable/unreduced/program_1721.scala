package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Int, b: T_B[(Char,Int)], c: Byte) extends T_A[T_B[T_A[Boolean]]]
case class CC_B(a: (T_B[CC_A],T_B[CC_A])) extends T_B[CC_A]
case class CC_C(a: ((Boolean,CC_A),T_A[CC_B]), b: Char) extends T_B[CC_A]
case class CC_D() extends T_B[CC_A]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_B((_,_)) => 0 
  case CC_C((_,_), _) => 1 
  case CC_D() => 2 
}
}