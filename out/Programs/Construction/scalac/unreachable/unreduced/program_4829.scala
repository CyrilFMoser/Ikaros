package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_B[Boolean]], b: (Byte,T_A[Byte]), c: Int) extends T_A[((Int,(Int,Int)),Char)]
case class CC_B() extends T_A[((Int,(Int,Int)),Char)]

val v_a: T_A[((Int,(Int,Int)),Char)] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_), _) => 0 
  case CC_B() => 1 
}
}