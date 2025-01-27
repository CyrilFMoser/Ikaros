package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_B[T_A[Char, Byte]], b: (T_A[Boolean, Byte],T_B[Byte])) extends T_A[Char, Byte]
case class CC_B() extends T_A[Char, Byte]

val v_a: T_A[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_)) => 0 
  case CC_B() => 1 
}
}