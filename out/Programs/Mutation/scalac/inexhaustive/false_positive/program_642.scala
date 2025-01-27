package Program_59 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Int], b: (Int,Int)) extends T_A[T_A[(Int,Char)]]

val v_a: T_A[T_A[(Int,Char)]] = null
val v_b: Int = v_a match{
  case CC_A(_, (12,_)) => 0 
}
}
// This is not matched: (CC_B (CC_A Boolean Char Wildcard (T_A Boolean Char))
//      Wildcard
//      (T_A (CC_A (Tuple Byte Boolean) Char Boolean Boolean)
//           (T_A Boolean Boolean)))