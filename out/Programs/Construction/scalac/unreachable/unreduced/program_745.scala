package Program_4 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[(Char,Boolean)]], b: (Int,(Byte,Char))) extends T_A[T_A[(Boolean,(Byte,Int))]]
case class CC_B() extends T_A[T_A[(Boolean,(Byte,Int))]]

val v_a: T_A[T_A[(Boolean,(Byte,Int))]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_)) => 0 
  case CC_B() => 1 
}
}