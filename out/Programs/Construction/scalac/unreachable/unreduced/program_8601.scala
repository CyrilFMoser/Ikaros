package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: (T_A[Int, Char],T_A[Int, (Byte,Byte)])) extends T_A[C, T_A[((Boolean,Int),Int), T_A[Char, Boolean]]]
case class CC_B[D]() extends T_A[D, ((Boolean,Int),T_A[Int, Int])]
case class CC_C[E](a: Int, b: (Byte,CC_A[Byte])) extends T_A[E, T_A[((Boolean,Int),Int), T_A[Char, Boolean]]]

val v_a: T_A[Char, T_A[((Boolean,Int),Int), T_A[Char, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_)) => 0 
  case CC_C(_, _) => 1 
}
}