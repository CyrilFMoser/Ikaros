package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B(a: T_B[(Boolean,Byte)], b: (T_A[Char],T_A[Int]), c: T_B[T_B[Char]]) extends T_A[CC_A[Boolean]]
case class CC_C() extends T_A[CC_A[Boolean]]
case class CC_D(a: Boolean) extends T_B[T_B[T_B[(Char,Boolean)]]]
case class CC_E() extends T_B[T_B[T_B[(Char,Boolean)]]]

val v_a: T_A[CC_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}