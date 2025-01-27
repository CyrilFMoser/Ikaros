package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[(Char,Int), T_A[Int, Byte]], C]
case class CC_B(a: CC_A[Byte], b: T_A[T_A[Boolean, Byte], CC_A[Byte]], c: ((Char,Int),T_A[Boolean, Int])) extends T_A[T_A[(Char,Int), T_A[Int, Byte]], T_A[(Char,Int), T_A[Byte, Byte]]]
case class CC_C[D](a: D, b: T_A[D, D], c: (CC_B,CC_A[CC_B])) extends T_A[T_A[(Char,Int), T_A[Int, Byte]], T_A[(Char,Int), T_A[Byte, Byte]]]

val v_a: T_A[T_A[(Char,Int), T_A[Int, Byte]], T_A[(Char,Int), T_A[Byte, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _, ((_,_),_)) => 1 
  case CC_C(_, _, _) => 2 
}
}