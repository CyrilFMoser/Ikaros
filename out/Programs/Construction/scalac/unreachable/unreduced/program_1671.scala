package Program_12 

object Test {
sealed trait T_A[A]
case class CC_A(a: (T_A[(Byte,Int)],T_A[Char]), b: Boolean) extends T_A[T_A[T_A[Boolean]]]
case class CC_B() extends T_A[T_A[T_A[Boolean]]]
case class CC_C(a: T_A[Int], b: CC_B) extends T_A[T_A[T_A[Boolean]]]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _) => 0 
  case CC_B() => 1 
  case CC_C(_, CC_B()) => 2 
}
}