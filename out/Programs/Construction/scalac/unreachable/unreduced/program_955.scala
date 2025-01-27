package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[T_A[Boolean, Byte], ((Int,Byte),(Boolean,Char))], T_A[T_A[Int, Char], (Int,Boolean)]]
case class CC_B(a: T_A[T_A[Boolean, (Byte,Int)], T_A[CC_A, Byte]], b: CC_A) extends T_A[T_A[T_A[Boolean, Byte], ((Int,Byte),(Boolean,Char))], T_A[T_A[Int, Char], (Int,Boolean)]]

val v_a: T_A[T_A[T_A[Boolean, Byte], ((Int,Byte),(Boolean,Char))], T_A[T_A[Int, Char], (Int,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}