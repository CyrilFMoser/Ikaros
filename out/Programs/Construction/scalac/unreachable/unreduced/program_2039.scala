package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: (T_A[Char, Byte],T_A[Int, Int]), c: C) extends T_A[T_A[(Boolean,Char), T_A[Int, (Boolean,Byte)]], C]
case class CC_B[D]() extends T_A[T_A[(Boolean,Char), T_A[Int, (Boolean,Byte)]], D]

val v_a: T_A[T_A[(Boolean,Char), T_A[Int, (Boolean,Byte)]], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_), _) => 0 
  case CC_B() => 1 
}
}