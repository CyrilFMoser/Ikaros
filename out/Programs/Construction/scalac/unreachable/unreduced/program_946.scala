package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Boolean) extends T_A[Int, C]
case class CC_B[D](a: T_A[D, D], b: (T_A[Int, (Boolean,Boolean)],T_A[Int, Int])) extends T_A[Int, D]

val v_a: T_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A(true) => 0 
  case CC_A(false) => 1 
  case CC_B(_, (_,_)) => 2 
}
}