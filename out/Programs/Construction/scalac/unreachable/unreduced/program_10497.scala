package Program_4 

object Test {
sealed trait T_A[A]
case class CC_A(a: (T_A[Int],(Boolean,Int))) extends T_A[T_A[(Char,Int)]]
case class CC_B[B]() extends T_A[T_A[(Char,Int)]]
case class CC_C() extends T_A[T_A[(Char,Int)]]

val v_a: T_A[T_A[(Char,Int)]] = null
val v_b: Int = v_a match{
  case CC_A((_,(_,_))) => 0 
  case CC_B() => 1 
  case CC_C() => 2 
}
}