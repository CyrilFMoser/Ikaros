package Program_8 

object Test {
sealed trait T_A[A]
case class CC_A(a: (Int,T_A[Int]), b: T_A[T_A[Int]], c: Byte) extends T_A[Int]
case class CC_B() extends T_A[Int]
case class CC_C(a: Int) extends T_A[Int]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _, _) => 0 
  case CC_B() => 1 
  case CC_C(_) => 2 
}
}