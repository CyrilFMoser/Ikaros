package Program_3 

object Test {
sealed trait T_A[A]
case class CC_A(a: (T_A[(Byte,Int)],T_A[Int]), b: T_A[T_A[Char]], c: ((Boolean,Char),T_A[Byte])) extends T_A[T_A[Char]]
case class CC_B(a: (CC_A,CC_A)) extends T_A[T_A[Char]]
case class CC_C(a: CC_A) extends T_A[T_A[Char]]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _, _) => 0 
  case CC_B((CC_A(_, _, _),CC_A(_, _, _))) => 1 
  case CC_C(CC_A((_,_), _, _)) => 2 
}
}