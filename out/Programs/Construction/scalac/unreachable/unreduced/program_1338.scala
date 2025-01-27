package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: (T_B[(Char,Boolean)],T_A[Int]), b: T_B[Char], c: Boolean) extends T_A[T_A[Char]]
case class CC_B() extends T_A[T_A[Char]]
case class CC_C() extends T_A[T_B[T_B[CC_B]]]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _, _) => 0 
  case CC_B() => 1 
}
}