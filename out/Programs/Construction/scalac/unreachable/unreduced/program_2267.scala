package Program_17 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[T_A[T_A[Boolean]]]
case class CC_B(a: CC_A[(Byte,Int)], b: T_A[T_A[Byte]], c: ((Int,Byte),T_A[Int])) extends T_A[T_A[T_A[Boolean]]]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _, ((_,_),_)) => 1 
}
}