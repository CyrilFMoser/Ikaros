package Program_29 

object Test {
sealed trait T_A[A]
case class CC_A(a: (T_A[Int],T_A[Char])) extends T_A[T_A[(Char,(Int,Int))]]
case class CC_B[B]() extends T_A[T_A[(Char,(Int,Int))]]

val v_a: T_A[T_A[(Char,(Int,Int))]] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B() => 1 
}
}