package Program_22 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: ((Char,Char),T_A[Char])) extends T_A[T_A[(Int,Int)]]
case class CC_B[C]() extends T_A[T_A[(Int,Int)]]
case class CC_C[D](a: CC_B[D], b: CC_A[D], c: (Int,CC_A[Byte])) extends T_A[T_A[(Int,Int)]]

val v_a: T_A[T_A[(Int,Int)]] = null
val v_b: Int = v_a match{
  case CC_A(((_,_),_)) => 0 
  case CC_B() => 1 
  case CC_C(_, _, (_,CC_A(_))) => 2 
}
}