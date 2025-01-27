package Program_24 

object Test {
sealed trait T_A[A]
case class CC_A(a: (T_A[Boolean],T_A[Boolean]), b: Boolean, c: (T_A[Char],T_A[Int])) extends T_A[T_A[T_A[Int]]]
case class CC_B() extends T_A[T_A[T_A[Int]]]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A((_,_), true, _) => 0 
  case CC_A((_,_), false, _) => 1 
  case CC_B() => 2 
}
}