package Program_20 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[Int]
case class CC_B(a: T_A[CC_A], b: Boolean, c: (T_A[CC_A],T_A[(Byte,Int)])) extends T_A[Int]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, (_,_)) => 1 
}
}