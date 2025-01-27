package Program_13 

object Test {
sealed trait T_A[A]
case class CC_A(a: (T_A[Int],T_A[Int]), b: T_A[Char], c: Int) extends T_A[T_A[(Int,Int)]]
case class CC_B() extends T_A[T_A[(Int,Int)]]
case class CC_C(a: T_A[CC_A], b: (((Int,Boolean),CC_B),CC_B)) extends T_A[T_A[(Int,Int)]]

val v_a: T_A[T_A[(Int,Int)]] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _, _) => 0 
  case CC_B() => 1 
  case CC_C(_, (_,_)) => 2 
}
}